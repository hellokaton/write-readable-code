// var update_highlight = function (message_num) {
//   if ($("#vote_value" + message_num).html() === "Up") {
//     $("thumbs_up" + message_num).addClass('highlighted');
//     $("thumbs_down" + message_num).removeClass('highlighted');
//   } else if ($("#vote_value" + message_num).html() === "Down") {
//     $("thumbs_up" + message_num).removeClass('highlighted');
//     $("thumbs_down" + message_num).addClass('highlighted');
//   } else {
//     $("thumbs_up" + message_num).removeClass('highlighted');
//     $("thumbs_down" + message_num).removeClass('highlighted');
//   }
// };

var update_highlight = function (message_num) {
  var thumbs_up = $("thumbs_up" + message_num);
  var thumbs_down = $("thumbs_down" + message_num);
  var vote_value = $("#vote_value" + message_num).html();
  var hi = 'highlighted';

  if (vote_value === "Up") {
    thumbs_up.addClass(hi);
    thumbs_down.removeClass(hi);
  } else if (vote_value === "Down") {
    thumbs_up.removeClass(hi);
    thumbs_down.addClass(hi);
  } else {
    thumbs_up.removeClass(hi);
    thumbs_down.removeClass(hi);
  }
};