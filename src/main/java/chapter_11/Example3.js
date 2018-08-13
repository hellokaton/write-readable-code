$.post({
    url: 'http://example.com/submit',
    data: data,
    success: function (response_data) {
        var str = '{\n';
        for (var key in response_data) {
            str += " " + key + " = " + response_data[key] + "\n";
        }
        alert(str + "}");
        // 继续处理响应数据
    }
});