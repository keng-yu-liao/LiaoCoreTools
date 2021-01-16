package com.example.liaoutils.dialog

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog

object LiaoDialog: LiaoDialogImpl {
    private var mTitle = ""

    override fun setDialogTitle(title: String) {
        mTitle = title
    }

    override fun getDialog(context: Context, msg: String): AlertDialog {
        return AlertDialog.Builder(context).apply {
            setTitle(mTitle)
            setMessage(msg)
        }.create()
    }

    override fun getPositiveDialog(
        context: Context,
        msg: String,
        positiveText: String,
        positiveListener: (DialogInterface, Int) -> Unit
    ): AlertDialog {
        return AlertDialog.Builder(context).apply {
            setTitle(mTitle)
            setMessage(msg)
            setPositiveButton(positiveText, positiveListener)
        }.create()
    }

    override fun getNormalDialog(
        context: Context,
        msg: String,
        positiveText: String,
        positiveListener: (DialogInterface, Int) -> Unit,
        negativeText: String,
        negativeListener: (DialogInterface, Int) -> Unit
    ): AlertDialog {
        return AlertDialog.Builder(context).apply {
            setTitle(mTitle)
            setMessage(msg)
            setPositiveButton(positiveText, positiveListener)
            setNegativeButton(negativeText, negativeListener)
        }.create()
    }
}