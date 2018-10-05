package com.example.admin.myapp;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.EditText;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 调用函数设置监听器监听单选按钮组
        this.setRadioCheckedChanged();
    }

    // 点击搜索按钮事件函数
    public void searchButtonOnClick(View target) {
        // 获取输入框信息
        EditText editText = findViewById(R.id.edit);
        String text = editText.getText().toString();

        if (text.length() == 0) {
            // 搜索内容为空
            Toast.makeText(getApplication(),"搜索内容不能为空",Toast.LENGTH_SHORT).show();
        } else {
            String tip = "搜索失败";
            if (text.equals("Health")) {
                RadioGroup radioGroup =  findViewById(R.id.radio_group);
                RadioButton chooseRadioButton = findViewById(radioGroup.getCheckedRadioButtonId());
                tip = chooseRadioButton.getText().toString() + "搜索成功";
            }
            final AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setTitle("提示").setMessage(tip);
            // 设置对话框确定按钮
            dialog.setPositiveButton("确认", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialogInterface,int i) {
                    Toast.makeText(getApplication(), "对话框“确定”按钮被点击", Toast.LENGTH_SHORT).show();
                }
            });
            // 设置对话框取消按钮
            dialog.setNegativeButton("取消", new DialogInterface.OnClickListener(){
                @Override
                public  void onClick(DialogInterface dialogInterface,int i){
                    Toast.makeText(getApplication(), "对话框“取消”按钮被点击", Toast.LENGTH_SHORT).show();
                }
            });
            dialog.create().show();
        }
    }

    private void setRadioCheckedChanged() {
        RadioGroup radioGroup = findViewById(R.id.radio_group);
        // 设置监听单选按钮组变化
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = findViewById(checkedId);
                Toast.makeText(getApplication(), rb.getText().toString()+"被选中", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
