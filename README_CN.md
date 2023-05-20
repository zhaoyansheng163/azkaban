# Azkaban 

[![Build Status](http://img.shields.io/travis/azkaban/azkaban.svg?style=flat)](https://travis-ci.org/azkaban/azkaban)[![codecov.io](https://codecov.io/github/azkaban/azkaban/branch/master/graph/badge.svg)](https://codecov.io/github/azkaban/azkaban)[![Join the chat at https://gitter.im/azkaban-workflow-engine/Lobby](https://badges.gitter.im/azkaban-workflow-engine/Lobby.svg)](https://gitter.im/azkaban-workflow-engine/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)[![Documentation Status](https://readthedocs.org/projects/azkaban/badge/?version=latest)](http://azkaban.readthedocs.org/en/latest/?badge=latest)

# 说明
这是版本 3.90.0的多语言版本（中文、英文），或者说是汉化版本
初衷：国内普遍不太习惯英文版本，但是官方并没有做多语言支持，为便于大家使用，整理了这个版本（参考了Schedulis）
大家一起在这个基础上不断完善，为大家提供一个用着习惯的版本。

以下是图片，编译相关问题参考 README.md

项目： [docs/zh_cn/project.png](docs/zh_cn/project.png)
![Alt](docs/zh_cn/project.png)

运行中：[docs/zh_cn/running.png](docs/zh_cn/running.png)
![Alt](docs/zh_cn/running.png)

定时调度：[docs/zh_cn/schedule.png](docs/zh_cn/schedule.png)
![Alt](docs/zh_cn/schedule.png)

执行历史：[docs/zh_cn/history.png](docs/zh_cn/history.png)
![Alt](docs/zh_cn/history.png)

工作流触发器：[docs/zh_cn/flowtrigger.png](docs/zh_cn/flowtrigger.png)
![Alt](docs/zh_cn/flowtrigger.png)

项目地址：
github：
https://github.com/zhaoyansheng163/azkaban

最新文档版本的汉化版本（3.90.0）
https://github.com/zhaoyansheng163/azkaban/tree/release3.90.0


gitee：
https://gitee.com/zhaoyansheng/azkaban

最新文档版本的汉化版本（3.90.0）
https://gitee.com/zhaoyansheng/azkaban/tree/release3.90.0/



如何打包汉化版本：

git clone https://gitee.com/zhaoyansheng/azkaban.git

git checkout   release3.90.0

./gradlew build -x test



其他操作步骤参考英文版的文档即可。其实差异就是切换到 汉化分支：release3.90.0








参考了如下项目：
https://gitee.com/WeBank/Schedulis

本地启动调试说明：


关键词：
azkaban 汉化
azkaban 中文
azkaban 汉语