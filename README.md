# Micronaut & Kotlin の GraphQL APIサンプル

## How to use

### アプリを起動

```
./gradlew run
```

### GraphiQLページにアクセス

```
http://localhost:8080/graphiql
```

### クエリを実行

```
query {
  hello(name: "misaosyushi")
}
```

下記データが帰ってくればOK

```
{
  "data": {
    "hello": "Hello misaosyushi!"
  }
}
```
