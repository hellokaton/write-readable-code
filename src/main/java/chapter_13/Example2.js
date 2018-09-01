// <div id="tip-1" class="tip">尝试搜索：王爵的技术小黑屋</div>
// <div id="tip-2" class="tip">尝试搜索：流行编程字体</div>
// <div id="tip-3" class="tip">尝试搜索：Github 使用技巧</div>

// <button onclick="show_next_tip()">查看历史搜索记录</button>

// var show_next_tip = function(){
//     var num_tips = $('.tip').size();
//     var show_tip = $('.tip:visible');
//
//     var show_tip_num = Number(show_tip.attr('id').slice(4));
//     if(show_tip_num === num_tips) {
//         $('#tip-1').show();
//     } else {
//         $('#tip-' + (show_tip_num + 1)).show();
//     }
//     show_tip.hide();
// };

var show_next_tip = function(){
    // 隐藏当前显示的搜索记录
    var cur_tip = $('.tip:visited').hide();
    // 找到下一个搜索记录
    var next_tip = cur_tip.next('.tip');
    if(next_tip.size() === 0){
        next_tip = $('.tip:first');
    }
    next_tip.show();
};