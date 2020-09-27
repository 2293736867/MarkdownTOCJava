# Java做的为README.md生成目录的小工具

# 1 概述

用`Java`做的为`README.md`生成目录的小工具，封装了[别人的`JAR`包](https://github.com/houbb/markdown-toc)，下载`JAR`包即可使用。

# 2 使用方法

需要`JDK11`环境：

```bash
java -jar toc.jar 1.md  # 为1.md文件生成目录
java -jar toc.jar 1     # 为文件夹1内的.md生成目录
```

示例：

![](https://img-blog.csdnimg.cn/20200926135133550.png)

# 3 如果出现异常

比如：

![](https://img-blog.csdnimg.cn/20200927185029637.png)

请手动编译运行：

```bash
java -Dfile.encoding=utf-8 -cp markdown.jar Main.java 1.md
```


