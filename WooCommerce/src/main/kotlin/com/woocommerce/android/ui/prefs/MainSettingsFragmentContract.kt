package com.woocommerce.android.ui.prefs

import com.woocommerce.android.ui.base.BasePresenter
import com.woocommerce.android.ui.base.BaseView

interface MainSettingsFragmentContract {
    interface Presenter : BasePresenter<View> {
        fun getUserDisplayName(): String
        fun getStoreDomainName(): String
    }

    interface View : BaseView<Presenter> {
        // TODO
    }
}
