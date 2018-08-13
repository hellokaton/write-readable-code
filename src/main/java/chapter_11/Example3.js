$.post({
    url: 'http://example.com/submit',
    data: data,
    success: function (response_data) {
        alert(format_pretty(response_data));
        // 继续处理响应数据
    }
});

function format_pretty(json_object) {
    var str = '{\n';
    for (var key in json_object) {
        str += " " + key + " = " + response_data[key] + "\n";
    }
    return str + "}";
}