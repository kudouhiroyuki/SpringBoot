# SpringBoot<br>
■環境<br>
IDE：Spring Tool Suite4<br>
ビルドツール：Gradle<br>

■設定<br>
「Web」→「Spring Web（WEBアプリを構築するためのスターター）」<br>
「Developer Tools」→「Spring Boot DevTools（再起動しなくてもコードが反映される）」<br>
「Template Engine」→「Thymeleaf（ビューを作成するためのテンプレートエンジン）」<br>


■インストールしているJavaバージョン確認<br>
/usr/libexec/java_home -V<br>

■使用しているJavaバージョン確認<br>
java -version<br>

■バージョン切り替え<br>
/usr/libexec/java_home -v "17"<br>
export JAVA_HOME=`/usr/libexec/java_home -v "17"`<br>
PATH=$JAVA_HOME/bin:$PATH<br>
source ~/.zshrc<br>

http://localhost:8080<br>

https://itsakura.com/java-springboot-hello<br>

```
System.out.println("test");
```