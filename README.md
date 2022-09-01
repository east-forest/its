# its
課題管理アプリ メモ

### MVCについて
- Java上のデータをフロント側に渡すために、Modelクラスを活用する
  - Model modelとセットすることで、呼び出し時にModelのインスタンスを呼ぶことができる

### Setup
#### spring-dev-tools
- ソースコードの変更内容を自動で反映してくれる
- Thymeleafで適用させるために、下記をapplication.propertiesに記載する
```
spring.thymeleaf.prefix= path名
```

#### Lombok
- Constructor、Getter、Setterを自動生成してくれるライブラリ
- @AllArgsConstructor
  - クラスの全ての引数を取るConstructorを自動生成してくれる
- @Data
  - GettterとSetterをまとめて作成してくれる

### ３層アーキテクチャ
- プレゼンテーション層（画面から入力・出力）
- ビジネスロジック層（業務ロジック）
- データアクセス層（データベースとのやりとり）

### DI(Dependency Injection）
- SpringでのDI = Bean登録（Javaクラスのこと）＋インジェクション
- 後ほど記載する




