var update_highlight = function (message_num) {
  if ($("#vote_value" + message_num).html() === "Up") {
    $("thumbs_up" + message_num).addClass('highlighted');
    $("thumbs_down" + message_num).removeClass('highlighted');
  } else if ($("#vote_value" + message_num).html() === "Down") {
    $("thumbs_up" + message_num).removeClass('highlighted');
    $("thumbs_down" + message_num).addClass('highlighted');
  } else {
    $("thumbs_up" + message_num).removeClass('highlighted');
    $("thumbs_down" + message_num).removeClass('highlighted');
  }
};