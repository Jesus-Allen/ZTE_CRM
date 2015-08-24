 $(document).ready(function() {
	 
	$('#user').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            userName: {
                message: '用户账号尚未验证。',
                validators: {
                    notEmpty: {
                        message: '用户账号不能为空'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '用户账号由3到20位数字英文字母、数字和下划线组成！'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '用户账号不包含除\_之外的符号！'
                    },
                    remote: {
                    	type:"post",
                        message: '用户名已经存在',
                        url: 'checkusernameaction.html',
                        data: {
                            type: 'userName'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userPwd: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空！'
                    },
					stringLength: {
                        min: 6,
                        max: 40,
                        message: '密码保持在6-40位字符长度！'
                    }
                }
            },
            affirmPwd: {
                validators: {
                    notEmpty: {
                        message: '确认密码不为空！'
                    },
                    identical: {
                        field: 'userPwd',
                        message: '两次密码不一致！'
                    }
                }
            },
			name: {
                message: '姓名尚未验证。',
                validators: {
                    notEmpty: {
                        message: '姓名不能为空！'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '用户账号由3到20位数字英文字母、数字和下划线组成！'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: '用户账号不包含除\_\\\ \.之外的符号！'
                    }
                }
            },
            userEmail: {
                validators: {
                    notEmpty: {
                        message: '邮箱不能为空'
                    },
                    emailAddress: {
                        message: '无效邮箱！请输入有效邮箱地址，如ABC@test.com'
                    },
                    remote: {
                    	type:"post",
                        message: '邮箱已经存在',
                        url: 'checkuseremailaction.html',
                        data: {
                            type: 'userEmail'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userTel: {
                message: '号码尚未验证。',
                validators: {
                    notEmpty: {
                        message: '联系电话不能为空！'
                    },
                    regexp: {
                        regexp: /^[1][3578]\d{9}$/,
                        message: '请填写有效号码！'
                    },
                    remote: {
                    	type:"post",
                        message: '该手机号码已经存在',
                        url: 'checkusertelaction.html',
                        data: {
                            type: 'userTel'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userUnit: {
                validators: {
                    notEmpty: {
                        message: '客户单位不能为空！'
                    }
                }
            },
            userUrl: {
                validators: {
                    uri: {
                        allowLocal: true,
                        message: '无效URL！请输入有效公司网址'
                    }
                }
            },
            check:{
            	validators: {
                    notEmpty: {
                        message: '您必须同意用户注册协议'
                    }
                }
            }
        }
    });
	$('#user2').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            userName: {
                message: '用户账号尚未验证。',
                validators: {
                    notEmpty: {
                        message: '用户账号不能为空'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '用户账号由3到20位数字英文字母、数字和下划线组成！'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '用户账号不包含除\_之外的符号！'
                    },
                    remote: {
                    	type:"post",
                        message: '用户名已经存在',
                        url: 'checkusernameaction.html',
                        data: {
                            type: 'userName'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userPwd: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空！'
                    },
					stringLength: {
                        min: 6,
                        max: 40,
                        message: '密码保持在6-40位字符长度！'
                    }
                }
            },
            affirmPwd: {
                validators: {
                    notEmpty: {
                        message: '确认密码不为空！'
                    },
                    identical: {
                        field: 'userPwd',
                        message: '两次密码不一致！'
                    }
                }
            },
			name: {
                message: '姓名尚未验证。',
                validators: {
                    notEmpty: {
                        message: '姓名不能为空！'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '用户账号由3到20位数字英文字母、数字和下划线组成！'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: '用户账号不包含除\_\\\ \.之外的符号！'
                    }
                }
            },
            userEmail: {
                validators: {
                    notEmpty: {
                        message: '邮箱不能为空'
                    },
                    emailAddress: {
                        message: '无效邮箱！请输入有效邮箱地址，如ABC@test.com'
                    },
                    remote: {
                    	type:"post",
                        message: '邮箱已经存在',
                        url: 'checkuseremailaction.html',
                        data: {
                            type: 'userEmail'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userTel: {
                message: '号码尚未验证。',
                validators: {
                    notEmpty: {
                        message: '联系电话不能为空！'
                    },
                    regexp: {
                        regexp: /^[1][3578]\d{9}$/,
                        message: '请填写有效号码！'
                    },
                    remote: {
                    	type:"post",
                        message: '手机号码已经存在',
                        url: 'checkusertelaction.html',
                        data: {
                            type: 'userTel'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userUnit: {
                validators: {
                    notEmpty: {
                        message: '客户单位不能为空！'
                    }
                }
            },
            userUrl: {
                validators: {
                    uri: {
                        allowLocal: true,
                        message: '无效URL！请输入有效公司网址'
                    }
                }
            },
            check:{
            	validators: {
                    notEmpty: {
                        message: '您必须同意用户注册协议'
                    }
                }
            }

        }
    });
	$('#user3').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            userName: {
                message: '用户账号尚未验证。',
                validators: {
                    notEmpty: {
                        message: '用户账号不能为空'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '用户账号由3到20位数字英文字母、数字和下划线组成！'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '用户账号不包含除\_之外的符号！'
                    },
                    remote: {
                    	type:"post",
                        message: '用户名已经存在',
                        url: 'checkusernameaction.html',
                        data: {
                            type: 'userName'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userPwd: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空！'
                    },
					stringLength: {
                        min: 6,
                        max: 40,
                        message: '密码保持在6-40位字符长度！'
                    }
                }
            },
            affirmPwd: {
                validators: {
                    notEmpty: {
                        message: '确认密码不为空！'
                    },
                    identical: {
                        field: 'userPwd',
                        message: '两次密码不一致！'
                    }
                }
            },
			name: {
                message: '姓名尚未验证。',
                validators: {
                    notEmpty: {
                        message: '姓名不能为空！'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '用户账号由3到20位数字英文字母、数字和下划线组成！'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: '用户账号不包含除\_\\\ \.之外的符号！'
                    }
                }
            },
            userEmail: {
                validators: {
                    notEmpty: {
                        message: '邮箱不能为空'
                    },
                    emailAddress: {
                        message: '无效邮箱！请输入有效邮箱地址，如ABC@test.com'
                    },
                    remote: {
                    	type:"post",
                        message: '邮箱已经存在',
                        url: 'checkuseremailaction.html',
                        data: {
                            type: 'userEmail'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userTel: {
                message: '号码尚未验证。',
                validators: {
                    notEmpty: {
                        message: '联系电话不能为空！'
                    },
                    regexp: {
                        regexp: /^[1][3578]\d{9}$/,
                        message: '请填写有效号码！'
                    },
                    remote: {
                    	type:"post",
                        message: '手机号码已经存在',
                        url: 'checkusertelaction.html',
                        data: {
                            type: 'userTel'
                        },
                        delay: 2000
                    
                    }
                
                }
            },
			userUnit: {
                validators: {
                    notEmpty: {
                        message: '客户单位不能为空！'
                    }
                }
            },
            userUrl: {
                validators: {
                    uri: {
                        allowLocal: true,
                        message: '无效URL！请输入有效公司网址'
                    }
                }
            },
            check:{
            	validators: {
                    notEmpty: {
                        message: '您必须同意用户注册协议'
                    }
                }
            }

        }
    });
	$('#user4').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            userName: {
                message: '用户账号尚未验证。',
                validators: {
                    notEmpty: {
                        message: '用户账号不能为空'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '用户账号由3到20位数字英文字母、数字和下划线组成！'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '用户账号不包含除\_之外的符号！'
                    },
                    remote: {
                    	type:"post",
                        message: '用户名已经存在',
                        url: 'checkusernameaction.html',
                        data: {
                            type: 'userName'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userPwd: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空！'
                    },
					stringLength: {
                        min: 6,
                        max: 40,
                        message: '密码保持在6-40位字符长度！'
                    }
                }
            },
            affirmPwd: {
                validators: {
                    notEmpty: {
                        message: '确认密码不为空！'
                    },
                    identical: {
                        field: 'userPwd',
                        message: '两次密码不一致！'
                    }
                }
            },
			name: {
                message: '姓名尚未验证。',
                validators: {
                    notEmpty: {
                        message: '姓名不能为空！'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '用户账号由3到20位数字英文字母、数字和下划线组成！'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: '用户账号不包含除\_\\\ \.之外的符号！'
                    }
                }
            },
            userEmail: {
                validators: {
                    notEmpty: {
                        message: '邮箱不能为空'
                    },
                    emailAddress: {
                        message: '无效邮箱！请输入有效邮箱地址，如ABC@test.com'
                    },
                    remote: {
                    	type:"post",
                        message: '邮箱已经存在',
                        url: 'checkuseremailaction.html',
                        data: {
                            type: 'userEmail'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userTel: {
                message: '号码尚未验证。',
                validators: {
                    notEmpty: {
                        message: '联系电话不能为空！'
                    },
                    regexp: {
                        regexp: /^[1][3578]\d{9}$/,
                        message: '请填写有效号码！'
                    },
                    remote: {
                    	type:"post",
                        message: '手机号已经存在',
                        url: 'checkusertelaction.html',
                        data: {
                            type: 'userTel'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userUnit: {
                validators: {
                    notEmpty: {
                        message: '客户单位不能为空！'
                    }
                }
            },
            userUrl: {
                validators: {
                    uri: {
                        allowLocal: true,
                        message: '无效URL！请输入有效公司网址'
                    }
                }
            },
            check:{
            	validators: {
                    notEmpty: {
                        message: '您必须同意用户注册协议'
                    }
                }
            }

        }
    });
	$('#user5').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            userName: {
                message: '用户账号尚未验证。',
                validators: {
                    notEmpty: {
                        message: '用户账号不能为空'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '用户账号由3到20位数字英文字母、数字和下划线组成！'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '用户账号不包含除\_之外的符号！'
                    },
                    remote: {
                    	type:"post",
                        message: '用户名已经存在',
                        url: 'checkusernameaction.html',
                        data: {
                            type: 'userName'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userPwd: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空！'
                    },
					stringLength: {
                        min: 6,
                        max: 40,
                        message: '密码保持在6-40位字符长度！'
                    }
                }
            },
            affirmPwd: {
                validators: {
                    notEmpty: {
                        message: '确认密码不为空！'
                    },
                    identical: {
                        field: 'userPwd',
                        message: '两次密码不一致！'
                    }
                }
            },
			name: {
                message: '姓名尚未验证。',
                validators: {
                    notEmpty: {
                        message: '姓名不能为空！'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '用户账号由3到20位数字英文字母、数字和下划线组成！'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: '用户账号不包含除\_\\\ \.之外的符号！'
                    }
                }
            },
            userEmail: {
                validators: {
                    notEmpty: {
                        message: '邮箱不能为空'
                    },
                    emailAddress: {
                        message: '无效邮箱！请输入有效邮箱地址，如ABC@test.com'
                    },
                    remote: {
                    	type:"post",
                        message: '邮箱已经存在',
                        url: 'checkuseremailaction.html',
                        data: {
                            type: 'userEmail'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userTel: {
                message: '号码尚未验证。',
                validators: {
                    notEmpty: {
                        message: '联系电话不能为空！'
                    },
                    regexp: {
                        regexp: /^[1][3578]\d{9}$/,
                        message: '请填写有效号码！'
                    },
                    remote: {
                    	type:"post",
                        message: '手机号码已经存在',
                        url: 'checkusertelaction.html',
                        data: {
                            type: 'userTel'
                        },
                        delay: 2000
                    
                    }
                }
            },
			userUnit: {
                validators: {
                    notEmpty: {
                        message: '客户单位不能为空！'
                    }
                }
            },
            userUrl: {
                validators: {
                    uri: {
                        allowLocal: true,
                        message: '无效URL！请输入有效公司网址'
                    }
                }
            },
            id:{
            	validators: {
                    notEmpty: {
                        message: '权限不能为空！'
                    }
                }
            }

        }
    });
});