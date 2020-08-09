# RecyclerCoverFlow
RecyclerViewを使用してレイアウトマネージャーがカルーセル効果を実現します。

![image](https://github.com/ChenLittlePing/RecyclerCoverFlow/blob/master/gif/demo.gif)

## Gradleの依存関係
最新バージョンを確認してください：[Release](https://github.com/ChenLittlePing/RecyclerCoverFlow/releases)

```
compile 'com.chenlittleping:recyclercoverflow:1.0.6'
```

## 使い方
### 1,xmlに追加
```xml
    <recycler.coverflow.RecyclerCoverFlow
            android:id="@+id/list"
            android:layout_width="match_parent"
            android:layout_height="match_parent">
    </recycler.coverflow.RecyclerCoverFlow>
```
### 2，Activityを初期化します。アダプターはRecyclerViewのアダプターとまったく同じです。
```java
    mList = (RecyclerCoverFlow) findViewById(R.id.list);
    //        mList.setFlatFlow(true); //平面ローリング
    mList.setAdapter(new Adapter(this));
    mList.setOnItemSelectedListener(new CoverFlowLayoutManger.OnSelected() {
        @Override
        public void onItemSelected(int position) {
            ((TextView)findViewById(R.id.index)).setText((position+1)+"/"+mList.getLayoutManager().getItemCount());
        }
    });
```

## 実現方法は以下を参照してください。：

https://www.jianshu.com/p/1837a801e599
