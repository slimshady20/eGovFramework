var user = user || {}
user = (function(){
	let _, javascript, session
	let init = function(){
		 _ = sessionStorage.getItem('context')
		 javascript = sessionStorage.getItem('javascript'),
		 session = sessionStorage.getItem('session')
	}
	let join = function(payload){
		$.ajax({
			url : _+`/user/join`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				location.href = _+`/location/users/LoginForm`
			},
			error: function(err){
				alert(err)
			}
		})
	}
	
	let login = function(payload){
		$.ajax({
			url : _+`/user/login/${payload.userid}`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				alert(res)
			},
			error: function(err){
				alert(err)
			}
		})
	}
	let logout = function(){
		sessionStroage.removeItem('userid')
		sessionStroage.removeItem('ctx')
		sessionStroage.removeItem('js')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('img')
	}
	return {init, join, login, logout}
})()