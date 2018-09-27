# 实验一
# 中山大学智慧健康服务平台应用开发

---  

---  

## 第四周任务  
## 基本的UI界面设计

---
  
### 实验目的
   1. 熟悉Android Studio开发工具操作。  
   2. 熟悉Android Studio基本UI开发，并进行UI基本设计。
   
---

### 实验内容
实现一个Android应用，界面呈现如图中的效果。  
 ![preview](https://gitee.com/code_sysu/PersonalProject1/raw/master/manual/images/preview.jpg) 

#### 要求  
* 该界面为应用启动后看到的第一个界面。  
* 各控件的要求
   1. 标题字体大小**20sp**，与顶部距离**20dp**，居中；
   2. 图片与上下控件的间距均为**20dp**，居中；  
   3. 输入框整体距左右屏幕各间距**20dp**，内容（包括提示内容）如图所示，内容字体大小**18sp**；  
   4. 按钮与输入框间距**10dp**，文字大小**18sp**。按钮背景框左右边框与文字间距**10dp**，上下边框与文字间距**5dp**，圆角半径**180dp**，背景色为**#3F51B5**；  
   5. 四个单选按钮整体居中，与输入框间距10dp，字体大小**18sp**，各个单选按钮之间间距**10dp**，默认选中的按钮为第一个。

#### 使用的组件
TextView、EditText、ConstraintLayout、Button、ImageView、RadioGroup、RadioButton。 

---

### 验收内容
* 各控件的位置，间距，字体大小等属性与要求无误
* 图片大小不作为验收内容给之一

---

### 完成期限
第五周各班实验课进行检查，未通过者需在下一周进行修改与重新检查，如再次未通过则扣除这一周任务的分数。

---

---
## 第五周任务
## 基础的事件处理
---
### 实验目的
   1. 了解Android编程基础。  
   2. 熟悉Button、RadioButton、EditText等基本控件，能够处理这些控件的基本事件。
   3. 学会弹出对话框，并定制对话框中的内容，能对确定和取消按钮的事件做处理。
   
---

### 实验内容
实现一个Android应用，界面呈现如图中的效果。  

![preview](https://gitee.com/code_sysu/PersonalProject1/raw/master/manual/images/preview.jpg)  
#### 要求  
* 该界面为应用启动后看到的第一个界面。  
* 各控件处理的要求
   1. 点击搜索按钮：
      * 如果搜索内容为空，弹出Toast信息“**搜索内容不能为空**”。
      * 如果搜索内容为“Health”，根据选中的RadioButton项弹出如下对话框。  
![success](https://gitee.com/code_sysu/PersonalProject1/raw/master/manual/images/success.jpg)  
点击“确定”，弹出Toast信息——**对话框“确定”按钮被点击**。  
点击“取消”，弹出Toast 信息——**对话框“取消”按钮被点击**。  
否则弹出如下对话框，对话框点击效果同上。  
![fail](https://gitee.com/code_sysu/PersonalProject1/raw/master/manual/images/fail.jpg)  
   2. RadioButton选择项切换：选择项切换之后，弹出Toast信息“**XX被选中**”，例如从图片切换到视频，弹出Toast信息“**视频被选中**”  

---

### 验收内容
* 布局是否正常
* 搜索内容为空时，提示是否正常
* 输入搜索内容后，点击搜索按钮是否能根据不同的搜索内容显示相应的弹出框，以及弹出框内容是否符合要求
* 点击弹出框的相应按钮是否能提示正确的内容
* RadioButton切换时，提示是否正常

---

### 完成期限
第六周各班实验课进行检查，未通过者需在下一周进行修改与重新检查，如再次未通过则扣除这一周任务的分数。

---

---

### 个人项目提交方式
经这周码云张总监技术分享，在同学们对git基本操作掌握后，现确定作业提交步骤如下
1. 布置的个人项目先fork到个人仓库下；
2. clone自己仓库的个人项目到本地目录；
3. 在个人项目中，在code、report目录下，进入自己所在的班别，然后新建个人目录，目录名为“学号+姓名拼音”，例如“**12345678WangXiaoMing**”；
4. 在“code\班别\12345678WangXiaoMing”目录下，新建Android项目，按要求完成界面设计，代码编写等，注意.gitignore的编写，避免添加不必要的中间文件、临时文件到git中，如果在检查时发现提交了不必要的文件，会扣一定的分数；
5. 实验报告按给出的模版(manual中的report_template.md)的内容要求，以md的格式，写在“report\班别\12345678WangXiaoMing”目录下，结果截图也放在该目录下；
6. 完成任务需求后，Pull Request回主项目的master分支，PR标题为“班级+学号+姓名”， 如“**周三班12345678王小明**”；
7. 一定要在deadline前PR。因为批改后，PR将合并到主项目，所有同学都能看到合并的结果，所以此时是不允许再PR提交作业的。