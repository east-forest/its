# 課題管理アプリ （Udemyで作成したもの）
- 基本的なCRUD

- 今後やりたい実装
  - バリデーション
  - 削除ボタン押下時に、アラートだす
  - 登録日時の登録と表示


https://user-images.githubusercontent.com/98323384/193721913-182912d2-c6c7-419b-a57d-2f8adc565bc9.mov


#### アノテーション
- @AllArgsConstructor
  - クラスの全ての引数を取るConstructorを自動生成してくれる
- @Data
  - GettterとSetterをまとめて作成してくれる
- @RequriredArgsController
- @Mapper
  - Mybatisを通して、データベースに接続できるようになる
- @Validated
  - Formに対して、バリデーションが適用されるようになる


## メモ
- 更新処理
  - 登録処理同様に、バリデーション処理を入れようとした所、`Exception evaluating SpringEL expression`が出力されてしまい、データ反映が上手くいっていない模様。
    - （多分）自動生成の値のため、getterの名前が [get + フィールド名] になっていないから（[参考サイト](https://qiita.com/axs-dev/items/f21cb004560416e98680)）
    
- 1つのformに複数のボタンがあるとき、判別方法
  - buttonタグの中で、nameを指定
  - Controllerクラスの@〇〇Mappingで、params=”name名”を指定する   
