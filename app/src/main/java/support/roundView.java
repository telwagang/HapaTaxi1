package support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by eurphrasia on 09/Feb/2016.
 */
public class roundView extends ImageView {
    public roundView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();

        if (drawable == null) {
            return;
        }

        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }

        Bitmap b = ((BitmapDrawable) drawable).getBitmap();
        Bitmap bitmap = b.copy(Bitmap.Config.ARGB_8888, true);

        int w = getWidth(), h = getHeight();

        Bitmap roundBitmap = getRoundedCroppedBitmap(bitmap, w);
        canvas.drawBitmap(roundBitmap, 0, 0, null);
        super.onDraw(canvas);
    }

    private Bitmap getRoundedCroppedBitmap(Bitmap bitmap, int radius) {


        //drawing a circle for the profile picture
        Bitmap finalbitmap;

        if (bitmap.getWidth() != radius || bitmap.getHeight() != radius) {
            finalbitmap = Bitmap.createScaledBitmap(bitmap, radius, radius, false);

            return finalbitmap;

        } else {
            finalbitmap = bitmap;
            Bitmap output = Bitmap.createBitmap(
                    finalbitmap.getWidth(),
                    finalbitmap.getHeight(),
                    Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(output);

            final Paint paint = new Paint();
            final Rect rect = new Rect(
                    0,
                    0,
                    finalbitmap.getWidth(),
                    finalbitmap.getHeight());
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setFilterBitmap(true);

            canvas.drawRGB(0, 0, 0);
            paint.setColor(Color.parseColor("#BAB399"));
            canvas.drawCircle(
                    finalbitmap.getWidth() / 2 + 0.7f,
                    finalbitmap.getHeight() / 2 + 0.7f,
                    finalbitmap.getWidth() / 2 + 0.1f,
                    paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(finalbitmap, rect, rect, paint);

            return output;
        }

    }
}

