##1、Jenkins登录名密码忘记解决办法

* 删除Jenkins安装目录下的config.xml文件<useSecurity>到</securityRealm>间的代码  
* 重启Jenkins
##2、重启Jenkins方法

### Windows下

* 打开cmd切换到Jenkins的安装目录下
* 停止Jenkins： jenkins.exe stop
* 启动Jenkins： jenkins.exe start

* 重启命令：jenkins.exe restart

### Mac下

##3、Dadily Build 每日构建  
分别是：minute hour dom month dow 

* minute：0-59。表示分钟数
* hour：0-23.表示小时数，即几点 
* dom：day of month。0-31.表示每月的几号  
* month：0-12。表示月份
* dow：0-7。表示周几  

每个格式都可以用以下字符表示:  

* * 表示所有可能的值。
* - 表示整数之间的范围 
* ， 代表指定的列表范围
*  / 表示指定的时间的间隔频率  

例： * 16 1,2  * * 表示：每月1号和2号的16点执行命令 
   * 15 * *　１-5 表示每周一到周五的15点执行
