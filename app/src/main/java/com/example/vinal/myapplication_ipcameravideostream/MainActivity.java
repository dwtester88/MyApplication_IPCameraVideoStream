package com.example.vinal.myapplication_ipcameravideostream;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements MediaPlayer.OnPreparedListener, SurfaceHolder.Callback {


    //  final static String RTSP_URL = "rtsp://192.168.1.10:8554/main"; //ipcamera of Sobo
    //final static String RTSP_URL = "http://10.0.40.166:8080";
    //final static String RTSP_URL = "http://10.0.40.166:8080/playlist.m3u";
    // final static String RTSP_URL = "rtsp://10.0.40.166:5554/camera";
    // final static String RTSP_URL = "http://192.168.1.101:8080";
    // final static String RTSP_URL = "rtsp://192.168.1.104:8555"; //ip of marian tablet
    //final static String RTSP_URL = "rtsp://192.168.1.105:8555"; // ip of  morgmax 3g6
    final static String RTSP_URL = "rtsp://192.168.1.100:8555"; // ip of  smartphone
    // final static String RTSP_URL = "rtsp://192.168.1.106:8555"; // ip of  4G7 morgmax
// final static String RTSP_URL = "rtsp://192.168.1.102:8555"; // ip of  3g6 zhuoda
    // final static String RTSP_URL = "rtsp://192.168.1.109:8555"; // ip of  marian's phone


    VideoView video;
    //MediaController mediacontroller = new MediaController(this);


    // ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //set up full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        // imageView=(ImageView) findViewById(R.id.image1);
        //imageView.setImageURI(Uri.parse(RTSP_URL));

        //webView.loadData("<html><head><meta name='viewport' content='target-densitydpi=device-dpi,initial-scale=1,minimum-scale=1,
        // user-scalable=yes'/></head><body><center><img src=\"http://192.168.0.101:8080/\" alt=\"Stream\" align=\"middle\"></center></body>
        // </html>", "text/html", null);


        video = (VideoView) findViewById(R.id.surfaceview);


        video.setVideoURI(Uri.parse(RTSP_URL));

        video.start();
        video.requestFocus();


       /* VideoView videoView = (VideoView) findViewById(R.id.surfaceview);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        mediaController.setMediaPlayer(videoView);


        Uri video = Uri.parse("rtsp://ss1c6.idc.mundu.tv:554/prf0/cid_29.sdp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(video);
        videoView.start();*/


    }

    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}
