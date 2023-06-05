■環境<br>
フレームワーク：SpringBoot(3.0.5)<br>
java：Java 17<br>
ビルドツール：Gradle<br>
IDE (統合開発環境) ：Spring Tool Suite4<br>

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
http://localhost:8080/departments<br>

curl -X GET "http://localhost:8080"<br>

■キーワード<br>
Spring JPA<br>
Entity（リレーション）<br>
ORM(Object-Relational Mapping)<br>
Thymeleaf<br>
ユーザ認証<br>

一意制約（ユニーク制約）<br>
一意制約とは、リレーショナルデータベースでテーブルにデータを追加・更新する際の制約の一つ<br>
その列の中でデータが一意（他と重複しない）でなければならないという制約。<br>

■エンティティの関連付け<br>
「User(FK)・Department」<br>
「ManyToOne・なし」（一方向）

＠OneToMany(1対多)<br>
＠OneToOne(1対1)<br>
＠ManyToOne(多対1)<br>
＠ManyToMany(多対多)<br>