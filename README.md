# 課題管理アプリ メモ
- Udemyで作成したものです。

https://user-images.githubusercontent.com/98323384/192077957-37ecaa8e-2918-437d-b864-861ae4c4537e.mov


### MVCについて
- Java上のデータをフロント側に渡すために、Modelクラスを活用する
  - Model modelとセットすることで、呼び出し時にModelのインスタンスを呼ぶことができる

#### Lombok
- Constructor、Getter、Setterを自動生成してくれるライブラリ

#### アノテーションについて
- @AllArgsConstructor
  - クラスの全ての引数を取るConstructorを自動生成してくれる
- @Data
  - GettterとSetterをまとめて作成してくれる
- @RequriredArgsController
  - 
- @Mapper
  - Mybatisを通して、データベースに接続できるようになる
- @Validated
  - Formに対して、バリデーションが適用されるようになる


