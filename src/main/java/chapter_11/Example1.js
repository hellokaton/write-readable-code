// 返回 'array' 中哪个位置最接近给定的经纬度
// 将地球塑造成一个完美的球体。
var findClosestLocation = function (lat, lng, array) {
    var closest;
    var closest_dist = Number.MAX_VALUE;
    for (var i = 0; i < array.length; i++) {
        // 将两个点转换为弧度
        var lat_rad = radians(lat);
        var lng_rad = radians(lat);
        var lat2_rad = radians(array[i].latitude);
        var lng2_rad = radians(array[i].longitude);

        // 使用'球面三角形的余弦定理'公式
        var dist = Math.acos(Math.sin(lat_rad) * Math.sin(lat2_rad) +
            Math.cos(lat_rad) * Math.cos(lat2_rad) +
            Math.cos(lng2_rad - lng_rad));

        if (dist < closest_dist) {
            closest = array[i];
            closest_dist = dist;
        }
    }
    return closest;
};

function radians(point) {
    return 1;
}