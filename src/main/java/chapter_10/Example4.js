var submmitted = false; // 全局变量

var submit_form = function (form_name) {
    if(submmitted) {
        return; // 不能重复提交
    }
    // 向后端发送请求
    // ...
    submmitted = true;
};


var f = function () {
    // 定义 i 的时候没有使用 var 声明
    for (i = 0; i < 10; i++){
        //
    }
};
f();