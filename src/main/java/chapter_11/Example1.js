// 返回 'array' 中哪个位置最接近给定的经纬度
// 将地球塑造成一个完美的球体。
var findClosestLocation = function (lat, lng, array) {
    var closest;
    var closest_dist = Number.MAX_VALUE;
    for (var i = 0; i < array.length; i++) {

        var dist = spherical_distance(lat, lng, array[i].latitude, array[i].longitude);
        if (dist < closest_dist) {
            closest = array[i];
            closest_dist = dist;
        }
    }
    return closest;
};

function spherical_distance(lat, lng, latitude, longitude) {
    // 将两个点转换为弧度
    var lat_rad = radians(lat);
    var lng_rad = radians(lng);
    var lat2_rad = radians(latitude);
    var lng2_rad = radians(longitude);

    // 使用'球面三角形的余弦定理'公式
    return Math.acos(Math.sin(lat_rad) * Math.sin(lat2_rad) +
        Math.cos(lat_rad) * Math.cos(lat2_rad) +
        Math.cos(lng2_rad - lng_rad));
}

function radians(point) {
    return 1;
}