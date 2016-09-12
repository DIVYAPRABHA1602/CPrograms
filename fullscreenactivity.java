import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements
View.OnClickListener {
private static final boolean AUTO_HIDE = true;
private static final int AUTO_HIDE_DELAY_MILLIS = 3000;
private static final int UI_ANIMATION_DELAY = 300;
private View mContentView;
private View mControlsView;private boolean mVisible;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
mVisible = true;
mControlsView = findViewById(R.id.fullscreen_content_controls);
mContentView = findViewById(R.id.fullscreen_content);
mContentView.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
toggle();
}
});
Button b = (Button) findViewById(R.id.button);b.setOnClickListener(this); // calling onClick() method
Button c=(Button) findViewById(R.id.button3);
c.setOnClickListener(this);
}
public void onClick(View v) {
EditText e1= (EditText)findViewById(R.id.num1);
EditText e2= (EditText)findViewById(R.id.num2);
TextView t1= (TextView)findViewById(R.id.sum);
TextView t2=(TextView)findViewById(R.id.mul);
TextView t3= (TextView)findViewById(R.id.sub);
switch (v.getId()) {
case R.id.button:
int n1, n2, res,res1,res2;
n1= Integer.parseInt(e1.getText().toString());
n2= Integer.parseInt(e2.getText().toString());
res=n1+n2;
res1=n1*n2;
res2=n1-n2;
t2.setText(Integer.toString(res1));
t3.setText(Integer.toString(res2));
t1.setText(Integer.toString(res));
break;
case R.id.button3:
e1.setText("");
e2.setText("");
t2.setText("");
t3.setText("");
t1.setText("");
break;
default:
break;}
}
@Override
protected void onPostCreate(Bundle savedInstanceState) {
super.onPostCreate(savedInstanceState);
delayedHide(100);
}
private final View.OnTouchListener mDelayHideTouchListener = new
View.OnTouchListener() {
@Overridepublic boolean onTouch(View view, MotionEvent motionEvent) {
if (AUTO_HIDE) {
delayedHide(AUTO_HIDE_DELAY_MILLIS);
}
return false;
}
};
private void toggle() {
if (mVisible) {
hide();
} else {
show();
}
}
private void hide() {
// Hide UI first
ActionBar actionBar = getSupportActionBar();
if (actionBar != null) {
actionBar.hide();
}
mControlsView.setVisibility(View.GONE);
mVisible = false;
mHideHandler.removeCallbacks(mShowPart2Runnable);
mHideHandler.postDelayed(UI_ANIMATION_DELAY);
}
private final Runnable mHidePart2Runnable = new Runnable() {
@SuppressLint("InlinedApi")
@Override
public void run() {
mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PRO
FILE
| View.SYSTEM_UI_FLAG_FULLSCREEN
| View.SYSTEM_UI_FLAG_LAYOUT_STABLE
| View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
| View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
}
};
@SuppressLint("InlinedApi")
private void show() {mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_F
ULLSCREEN
| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
mVisible = true;
mHideHandler.removeCallbacks(mHidePart2Runnable);
mHideHandler.postDelayed(mShowPart2Runnable,
UI_ANIMATION_DELAY);
}
private final Runnable mShowPart2Runnable = new Runnable() {
@Override
public void run() {
// Delayed display of UI elements
ActionBar actionBar = getSupportActionBar();
if (actionBar != null) {
actionBar.show();
}
mControlsView.setVisibility(View.VISIBLE);
}
};
private final Handler mHideHandler = new Handler();
private final Runnable mHideRunnable = new Runnable() {
@Override
public void run() {}
mControlsView.setVisibility(View.VISIBLE);
}
};
private final Handler mHideHandler = new Handler();
private final Runnable mHideRunnable = new Runnable() {
@Override
public void run() {
hide();
}
};
private void delayedHide(int delayMillis) {
mHideHandler.removeCallbacks(mHideRunnable);
mHideHandler.postDelayed(mHideRunnable, delayMillis);
}
