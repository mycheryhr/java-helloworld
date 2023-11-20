## Set Pipeline
```sh
fly --target bts destroy-pipeline -p hello-world
fly --target bts sp -p hello-world -c build-and-push-simple-image.yml
fly --target bts up -p hello-world
fly -t bts  tj -j hello-world/publish-image -w
```

## 说明
> Dockerfile中依赖的镜像,必须公开，尚不支持私有镜像
