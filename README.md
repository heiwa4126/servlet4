# servlet4

Spring Boot, JAVA, Gradle(groovy) のサンプル。

`gradle init --type java-application --dsl groovy --test-framework junit`
で作って、
[Spring Initializr](https://start.spring.io/)
で作ったコードを混ぜたやつ。


# 実行メモ

git cloneしたら、
プロジェクトフォルダに移動して、
最初に1回 `gradle wrapper`.

`./gradlew bootRun` でテスト実行

`./gradlew bootJar`, `./gradlew bootWar` で ./build/libにjarとwar

`jar -jar build/lib/xxx.jar`でスタンダロン実行


# 参考

- [Spring Boot Gradle プラグインリファレンスガイド - ドキュメント](https://spring.pleiades.io/spring-boot/docs/current/gradle-plugin/reference/html/)
- [Build Init Plugin](https://docs.gradle.org/current/userguide/build_init_plugin.html)
- [Spring MVCのコントローラでの戻り値いろいろ - Qiita](https://qiita.com/tag1216/items/3680b92cf96eb5a170f0)
- [8.開発ツール - Spring Boot を使用する - 公式ドキュメントの日本語訳](https://spring.pleiades.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-devtools)
- [Spring Boot アプリケーションプロパティ一覧 - ドキュメント](https://spring.pleiades.io/spring-boot/docs/current/reference/html/appendix-application-properties.html)
