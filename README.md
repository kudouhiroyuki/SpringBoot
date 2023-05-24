■環境<br>
フレームワーク：SpringBoot(3.0.5)<br>
IDE (統合開発環境) ：Spring Tool Suite4<br>
ビルドツール：Gradle<br>

■設定<br>
「Web」→「Spring Web（WEBアプリを構築するためのスターター）」<br>
「Developer Tools」→「Spring Boot DevTools（再起動しなくてもコードが反映される）」<br>
「Template Engine」→「Thymeleaf（ビューを作成するためのテンプレートエンジン）」<br>
「SQL」→「JDBC API（Javaからデータベースを操作するインターフェイス）」<br>
「SQL」→「MySQL Driver（MySQLへの接続ドライバ）」<br>

■インストールしているJavaバージョン確認<br>
/usr/libexec/java_home -V<br>

■使用しているJavaバージョン確認<br>
java -version<br>

■バージョン切り替え<br>
/usr/libexec/java_home -v "17"<br>
export JAVA_HOME=`/usr/libexec/java_home -v "17"`<br>
PATH=$JAVA_HOME/bin:$PATH<br>
source ~/.zshrc<br>

■Lombok設定<br>
①ダウンロード（https://projectlombok.org/download）<br>
②ファイル配置（/Applications/SpringToolSuite4.app/Contents/Eclipse）<br>
③ファイル実行（/Applications/SpringToolSuite4.app/Contents/Eclipse/SpringToolSuite4.ini）<br>
④Install/Updateクリック<br>
⑤完了（-javaagent:/Applications/SpringToolSuite4.app/Contents/Eclipse/lombok.jar）<br>

http://localhost:8080<br>
http://localhost:8080/users<br>

https://itsakura.com/java-springboot-hello<br>