/*
* Add package name here.
*/

import android.content.Context
import android.util.DisplayMetrics
import android.util.TypedValue

/*
* calculate pixel scale factor
*/
private fun getPixelScaleFactor(context: Context): Float = context.resources.displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT

/*
* convert sp to pixel
*/
fun spToPx(context: Context, sp: Int): Float = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp.toFloat(), context.resources.displayMetrics)

/*
* convert px to dp
*/
fun pxToDp(context: Context, px: Int): Int = Math.round(px / getPixelScaleFactor(context))

/*
* convert dp to pixel
*/
fun dpToPx(context: Context, dp: Int): Int = Math.round(dp * getPixelScaleFactor(context))