const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    port: 8081, // 设置开发服务器端口为 8081
    host: 'localhost', // 设置主机名为 localhost
  },
})
