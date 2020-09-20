package com.example.snoker.view.smokeinfo


import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.snoker.R
import com.example.snoker.base.BaseActivity
import com.example.snoker.databinding.ActivitySmokeInfoBinding
import kotlinx.android.synthetic.main.activity_smoke_info.*
import kotlinx.android.synthetic.main.activity_smoke_info.nextButton
import kotlinx.android.synthetic.main.activity_user_register.*


class SmokeInfoActivity : BaseActivity<ActivitySmokeInfoBinding, SmokeInfoViewModel>() {

    val buttonObserver = Observer<Boolean> {
        nextButton.isEnabled = it == true
    }

    override val layoutResourceId: Int
        get() = R.layout.activity_smoke_info

    override val viewModel: SmokeInfoViewModel = SmokeInfoViewModel()

    override fun initStartView() {
    }

    override fun initDataBinding() {
        val binding: ActivitySmokeInfoBinding = DataBindingUtil.setContentView(this, layoutResourceId)
        binding.viewmodel = viewModel
        binding.viewmodel!!.isActiveButton.observe(this, buttonObserver)

        registerForContextMenu(smokeCountText)
        registerForContextMenu(smokeTimeText)
    }

    override fun initAfterBinding() {
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        when(v?.id) {
            R.id.smokeCountText-> {
                menu?.setHeaderTitle("개비")
                menuInflater.inflate(R.menu.smoke_count_menu, menu)
            }
            R.id.smokeTimeText-> {
                menu?.setHeaderTitle("시간")
                menuInflater.inflate(R.menu.smoke_time_menu, menu)
            }
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        viewModel.contextMenuCheck(item)

        return super.onContextItemSelected(item)
    }
}