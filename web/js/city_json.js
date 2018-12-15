$(function () {
    $("#province").change(function () {
        var pid = $(this).val();

        $.post("ServletCityJson", {pid: pid}, function (data, status) {
            // 清空以前的值
            $("#city").html("<option value=''>--请选择--</option>");
            // 遍历
            $(data).each(function (index, c) {
                $("#city").append("<option value='" + c.id + "'>" + c.cname + "</option>");
            })
        }, "json")
    });
});