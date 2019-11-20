package com.woocommerce.android.util

import android.content.Context
import com.woocommerce.android.BuildConfig

/**
 * "Feature flags" are used to hide in-progress features from release versions
 */
enum class FeatureFlag {
    PRODUCT_LIST,
    PRODUCT_RELEASE_TEASER,
    ADD_EDIT_PRODUCT_RELEASE_1,
    DB_DOWNGRADE,
    REFUNDS;
    fun isEnabled(context: Context? = null): Boolean {
        return when (this) {
            PRODUCT_LIST -> BuildConfig.DEBUG
            PRODUCT_RELEASE_TEASER -> BuildConfig.DEBUG
            ADD_EDIT_PRODUCT_RELEASE_1 -> BuildConfig.DEBUG
            REFUNDS -> BuildConfig.DEBUG
            DB_DOWNGRADE -> {
                BuildConfig.DEBUG || context != null && PackageUtils.isBetaBuild(context)
            }
        }
    }
}
