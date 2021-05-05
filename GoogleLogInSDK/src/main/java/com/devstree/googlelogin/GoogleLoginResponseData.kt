package com.devstree.googlelogin

import android.net.Uri
import java.io.Serializable

/**
 * Created by Jimit Shah on 09/01/21
 */
class GoogleLoginResponseData : Serializable {

    var id: String = ""
    var name: String = ""
    var email: String = ""
    var familyName: String = ""
    var givenName: String = ""
    var idToken: String = ""
    var serverAuthCode: String = ""
    var profilePic: String = ""

}