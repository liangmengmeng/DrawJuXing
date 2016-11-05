package juxing.bwie.com.drawjuxing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by admina on 2016/11/5.
 */
public class MyView extends View {
    //设置画笔
    private Paint paint=new Paint();


    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画笔的粗细
        paint.setTextSize(50);
        //设置画笔的颜色
        paint.setColor(Color.RED);
        /*画直线
        * 1、(第一个参数:线的左边距)
        2、(第二个参数:线的头部的上边距)
        3、(第三个参数:线的尾部的上边距)
        4、(第四个参数:线的长度)
        5、(画笔paint)
         */
        canvas.drawLine(50, 200, 500, 100, paint);

        canvas.drawLine(50, 200, 500, 100, paint);
        /*
        画矩形
        1、第一个参数：矩形左边的X坐标
        2、第二个参数：矩形顶部的Y坐标
        3、第三个参数：矩形右边的X坐标
        4、第四个参数：矩形底部的Y坐标
        */
        //参数int类型
        //Rect rect=new Rect(100,500,300,600);
        //参数float类型
        RectF rectf=new RectF(100,500,300,600);
        //矩形
        //canvas.drawRect(rect,paint);
        //圆角矩形
        canvas.drawRoundRect(rectf,30,30,paint);

    }
}
