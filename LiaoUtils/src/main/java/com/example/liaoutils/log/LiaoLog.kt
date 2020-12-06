package com.example.liaoutils.log

import android.content.Context
import android.util.Log

object LiaoLog {
    const val LIAO_TAG = "LIAO_TAG"

    fun showDebugLog(msg: String) {
        Log.d("[${LIAO_TAG}]", msg)
    }

    fun showDebugCtxLog(currentCtx: Context, msg: String) {
        val currentCtxName = currentCtx.javaClass.simpleName
        Log.d("[${LIAO_TAG}]-CurrentCtx:${currentCtxName}", msg)
    }

    fun showErrorLog(errMsg: String) {
        Log.e("[${LIAO_TAG}]", errMsg)
    }

    fun showErrorCtxLog(currentCtx: Context, errMsg: String) {
        val currentCtxName = currentCtx.javaClass.simpleName
        Log.e("[${LIAO_TAG}]-CurrentCtx:${currentCtxName}", errMsg)
    }
}