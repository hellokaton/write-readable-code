# 把信息装到名字里

## 有表现力的词

| 单词 | 更多选择 | 
|-------|:--------:| 
| send | deliver、dispatch、announce、distribute、route | 
| find | search、extract、locate、recover | 
| start | launch、create、begin、open | 
| make | create、set up、build、generate、compose、add、new |

## 带单位的命名

| 参数或变量 | 带单位的命名 | 
|-------|:--------:| 
| start(int delay) | delay -> delaySecs | 
| createCache(int size) | size -> sizeMB | 
| throttleDownload(float limit) | limit -> maxKB | 
| setHeight(float height) | height -> heightCM | 

## 给名字附加额外信息

| 场景 | 变量名 | 更好的名字 | 
|-------|:--------:|:-------:| 
| 一个纯文本的密码，需要加密后才可以使用 | password | plaintextPassword | 
| 一条用户评论，需要转义后显示 | comment | unescapedComment | 
| 已转化为UTF-8的HTML文本 | html | htmlUtf8 |
| 以"URL"方式编码的输入数据 | data | dataURLEncode |

**[谷歌代码规范](https://github.com/google/styleguide) | [中文](http://zh-google-styleguide.readthedocs.io/en/latest/)** 

- [Java 代码规范](https://google.github.io/styleguide/javaguide.html)
- [C++ 代码规范](https://google.github.io/styleguide/cppguide.html)
- [Python 代码规范](https://github.com/google/styleguide/blob/gh-pages/pyguide.md)
- [JavaScript 代码规范](https://google.github.io/styleguide/jsguide.html)

## 总结

1. 使用专业的词
2. 避免使用空泛的词
3. 给变量名带上附加信息
4. 为作用域更大的变量起一个长的名字
5. 有目的的使用大小写和下划线