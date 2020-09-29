/**
 * 
 */

function validar(){
	let nome = frmContato.nome.value
	let cpf = frmContato.cpf.value
	let telefone = frmContato.telefone.value
	let email = frmContato.email.value
	if (nome == ""){
		alert('Preencha o campo nome');
		frmContato.nome.focus()
		return false
	} else if(cpf == ""){
		alert('Preencha o campo cpf');
		frmContato.cpf.focus()
		return false
	} else if(telefone == ""){
		alert('Preencha o campo telefone');
		frmContato.telefone.focus()
		return false
	} else if(email == ""){
		alert('Preencha o campo email');
		frmContato.email.focus()
		return false
	}else{
		document.forms["frmContato"].submit()
	}
		
}