package com.pipvideo.youtubepipvideoplayer;

import android.support.v7.app.AppCompatActivity;

public class FlyingVideo {
    private static TaskCoffeeVideo taskCoffeeVideo = null;

    public static TaskCoffeeVideo get(AppCompatActivity activity) {
        if (taskCoffeeVideo == null) {
            taskCoffeeVideo = TaskCoffeeVideo.getInstance(activity);
        }
        return taskCoffeeVideo;
    }
}
