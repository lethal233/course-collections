# securitylab

**Name**: 黎诗龙

**SID**: 11811407

# Answers
1. What kind of security problems you have in your app?
  - Before the version 1.2.68 (inclusive), it has remote code execution vulnerability, which will be exploited to obtain the authentication of the http server.  
  
2. What you can do to induce the risk and improve security?
  - According to the Safety Team of the Tecent, it is possible to edit configurations like this:
```java
ParserConfig.getGlobalInstance().setSafeMode(true);
```
  - Input validation, permission and authentication check.
