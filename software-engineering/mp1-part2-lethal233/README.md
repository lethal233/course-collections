# mp1-part2

**Name:** 黎诗龙

**SID:** 11811407

# Answers
## Astor
1. [jhy/jsoup issue #1219](https://github.com/jhy/jsoup/issues/1219).
2. Time: 9.815s
3. Can't run
4. 
![image](https://user-images.githubusercontent.com/47763046/114350883-6a90a580-9b9c-11eb-926f-8484ebd96488.png)


![image](https://user-images.githubusercontent.com/47763046/114349828-f86b9100-9b9a-11eb-8553-8fb073eccab0.png)
I found that astor cannot run with jsoup because of the compiler error **i.(1)at spoon.support.compiler.jdt.JDTSpoonCompiler.?**


And I run `mvn clean compile test` in jsoup is ok:
![image](https://user-images.githubusercontent.com/47763046/114350210-7d56aa80-9b9b-11eb-93f1-9a849267b555.png)
My environment is
```
jdk: java1.8.0_u281
maven: 3.6.3
```
If I change the jdk to jdk 1.6, then the maven test cannot be passed, since maven 3.3+ needs jdk7+. 

## Prapr
1. [jhy/jsoup issue #1219](https://github.com/jhy/jsoup/issues/1219).
2. Time: 4.311s
3. Can run, but no results.
4. 
![image](https://user-images.githubusercontent.com/47763046/114353433-982b1e00-9b9f-11eb-8a3d-d845a39cf785.png)

The tool cannot find a plausible patch in the search, since it has not results.
