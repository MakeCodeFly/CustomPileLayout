package com.beiing.pilelayout;

import android.app.Activity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

/**
 * <pre>
 *     author: MakeCodeFly
 *     desc  : GlideUtils类
 *     email:15695947865@139.com
 * </pre>
 */

public class GlideUtils {



    /**
     * 加载圆形头像
     */
    public static void loadCustomerViewHolder(final Activity activity, String path, final ImageView mImageView) {
        RequestOptions requestOptions = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.mipmap.ic_launcher)  //指定加载前显示的图片资源
                .fallback(R.mipmap.ic_launcher)//指定传递加载资源为 null 的时候，显示的图片资源
                .error(R.mipmap.ic_launcher)//指定加载失败显示的图片资源
                .transform(new GlideCircleTransform());
        Glide.with(activity).load(path).apply(requestOptions).into(mImageView);
    }


}

