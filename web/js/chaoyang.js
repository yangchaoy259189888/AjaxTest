// 捕获键盘弹起的事件
// 在文档就绪的时候，对某一个元素进行onkeyup事件监听

$(function () {
    $("#words").keyup(function () {
        var words = $("#words").val();

        if (words == "") {
            $("#div01").hide();
        } else {
            $.post("ServletFindWords", {words: words}, function (data, status) {
                $("#div01").show();
                $("#div01").html(data);
            });
        }
    });
});