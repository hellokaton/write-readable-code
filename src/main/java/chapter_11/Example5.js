var max_results;
var cookies = document.cookie.split(';');
for (var i = 0; i < cookies.length; i++) {
    var c = cookies[i];
    c = c.replace(/^[ ]+/, ''); // 移除多余的空格
    if (c.indexOf('max_results') === 0) {
        max_results = Number(c.substring(12, c.length));
    }
}