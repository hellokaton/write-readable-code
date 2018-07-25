var submmitted = false;

var submit_form = function (form_name) {
    if(submmitted) {
        return; // 不能重复提交
    }
    // 向后端发送请求
    // ...
    submmitted = true;
};