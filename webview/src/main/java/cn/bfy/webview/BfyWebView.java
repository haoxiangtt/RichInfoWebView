package cn.bfy.webview;

import android.content.Context;
import android.util.AttributeSet;

/**
 * <pre>
 * @copyright  : Copyright ©2004-2018 版权所有　XXXXXXXXXXXXXXX
 * @company    : XXXXXXXXXXXXXXX
 * @author     : OuyangJinfu
 * @e-mail     : jinfu123.-@163.com
 * @createDate : 2017/6/14 0014
 * @modifyDate : 2017/6/14 0014
 * @version    : 1.0
 * @desc       : 通用网页加载控件
 * </pre>
 */

public class BfyWebView extends BaseWebView {

    public BfyWebView(Context context) {
        this(context, null);
    }

    public BfyWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BfyWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BfyWebView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
