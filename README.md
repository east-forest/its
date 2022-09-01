# its
課題管理アプリ メモ

### MVCについて
- Java上のデータをフロント側に渡すために、Modelクラスを活用する
  - Model modelとセットすることで、呼び出し時にModelのインスタンスを呼ぶことができる

### 開発効率UPするために
- spring-dev-tools
  - ソースコードの変更内容を自動で反映してくれる
  - Thymeleafで適用させるために、下記をapplication.propertiesに記載
    ```
    spring.thymeleaf.prefix= path名
    ```

## エラー出た時
```
template might not exist or might not be accessible by any of the configured Template Resolvers
```
- htmlファイルのパスが間違っていることを確認する
