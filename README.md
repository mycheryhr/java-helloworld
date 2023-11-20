## 使用Java Maven构建Helloworld镜像

> 在进行镜像构建时通常需要配置Java及Maven环境，比较费时，可使用以下Dockerfile直接打包项目

```sh
docker build -t helloworld:1.0.0 .
```

## 优化项
[Aliyun Maven](https://developer.aliyun.com/mirror/maven)

- 可将Maven镜像添加aliyun的镜像站，提高编译打包速度，修改/usr/share/maven/conf/settings.xml文件即可
