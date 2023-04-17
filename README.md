# SpringBoot<br>

■インストールしているJavaバージョン確認<br>
/usr/libexec/java_home -V<br>

■使用しているJavaバージョン確認<br>
java -version<br>

■バージョン切り替え<br>
/usr/libexec/java_home -v "17"<br>
export JAVA_HOME=`/usr/libexec/java_home -v "17"`<br>
PATH=$JAVA_HOME/bin:$PATH<br>
source ~/.zshrc<br>

■設定<br>
「Web」→「Spring Web」<br>
「Developer Tools」→「Spring Boot DevTools」<br>
「Template Engine」→「Thymeleaf」<br>

http://localhost:8080/user<br>

https://itsakura.com/java-springboot-hello<br>

```
System.out.println("test");
```