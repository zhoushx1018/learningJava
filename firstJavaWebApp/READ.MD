
# firstJavaWebApp 实践记录 #
从零开始，java web app 的学习实践

      

## 搭建java web 的 IDE环境（windows） ##

	1. 安装jdk
		到java 官网下载 jdk，安装
		如安装到
			C:\Program Files\Java\jdk1.8.0_121

	2.java 相关环境变量的设置
		新增 JAVA_HOME
     		C:\Program Files\Java\jdk1.8.0_121
		CLASSPATH  追加如下
     		;%JAVA_HOME %\lib\dt.jar; %JAVA_HOME %\lib\tools.jar; .
		Path 追加如下
     		; %JAVA_HOME %\bin
	
	3.安装tomcat
		到 tomcat官网下载安装程序（*.exe）  # .exe安装包比起压缩包(*.zip等)，安装起来更方便
		安装 tomcat
	
	4.tomcat 相关环境变量的设置
		使用安装程序（*.exe)安装的话，不需要额外配置 相关环境变量；
		使用压缩包(*.zip等）安装的话，需要另行配置相关环境变量：
			新增 CATALINA_HOME
				F:\Program Files\Apache-Tomcat 8.5

		
	






