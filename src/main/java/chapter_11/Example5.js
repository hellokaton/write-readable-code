var max_results = get_cookie("max_results");
// name1=value1; name2=value2;
// var cookies = document.cookie.split(';');
// for (var i = 0; i < cookies.length; i++) {
//     var c = cookies[i];
//     c = c.replace(/^[ ]+/, ''); // 移除多余的空格
//     if (c.indexOf('max_results') === 0) {
//         max_results = Number(c.substring(12, c.length));
//     }
// }

function get_cookie(key) {
    var cookies = document.cookie.split(';');
    for (var i = 0; i < cookies.length; i++) {
        var c = cookies[i];
        c = c.replace(/^[ ]+/, ''); // 移除多余的空格
        if (c.indexOf(key) === 0) {
            return c.substring(key.length + 1, c.length);
        }
    }
    return null;
}