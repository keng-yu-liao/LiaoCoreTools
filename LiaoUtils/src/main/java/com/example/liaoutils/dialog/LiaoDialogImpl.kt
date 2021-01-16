package com.example.liaoutils.dialog

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog

interface LiaoDialogImpl {

    //設定視窗title
    fun setDialogTitle(title: String)

    //警告視窗，沒有按鈕
    fun getDialog(context: Context, msg: String): AlertDialog

    //警告視窗，正向按鈕
    fun getPositiveDialog(context: Context, msg: String, positiveText: String, positiveListener: (DialogInterface, Int) -> Unit): AlertDialog

    //警告視窗，正負向按鈕
    fun getNormalDialog(context: Context, msg: String, positiveText: String, positiveListener: (DialogInterface, Int) -> Unit, negativeText: String, negativeListener: (DialogInterface, Int) -> Unit): AlertDialog
}